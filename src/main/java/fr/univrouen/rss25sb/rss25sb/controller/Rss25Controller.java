package fr.univrouen.rss25sb.rss25sb.controller;

import fr.univrouen.rss25sb.rss25sb.model.Feed;
import fr.univrouen.rss25sb.rss25sb.service.Rss25Service;
import fr.univrouen.rss25sb.rss25sb.util.XsltTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.TransformerException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/rss25SB")
public class Rss25Controller {
    @Autowired
    private Rss25Service rss25Service;

    @GetMapping(value = "/resume/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public Feed getResumeXml() {
        return rss25Service.getResume();
    }

    @GetMapping(value = "/resume/html", produces = MediaType.TEXT_HTML_VALUE)
    public String getResumeHtml() throws Exception {
        return XsltTransformer.transformToHtml(rss25Service.getResume(), "resume.xsl");
    }

    @GetMapping(value = "/xml/{id}", produces = MediaType.APPLICATION_XML_VALUE)
    public Object getItemXml(@PathVariable Long id) {
        Feed feed = rss25Service.getItem(id);
        if (feed == null) {
            Map<String, String> error = new HashMap<>();
            error.put("id", id.toString());
            error.put("status", "ERROR");
            return error;
        }
        return feed;
    }

    @GetMapping(value = "/html/{id}", produces = MediaType.TEXT_HTML_VALUE)
    public String getItemHtml(@PathVariable Long id) throws Exception {
        Feed feed = rss25Service.getItem(id);
        if (feed == null) {
            Map<String, String> error = new HashMap<>();
            error.put("id", id.toString());
            error.put("status", "ERROR");
            return "<html><body><p>id: " + id + ", status: ERROR</p></body></html>";
        }
        return XsltTransformer.transformToHtml(feed, "detail.xsl");
    }

    @PostMapping(value = "/insert", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public Map<String, String> insertItem(@RequestBody Feed feed) {
        Map<String, String> response = new HashMap<>();
        if (rss25Service.isDuplicate(feed)) {
            response.put("status", "ERROR");
            return response;
        }
        Long id = rss25Service.saveFeed(feed);
        response.put("id", id.toString());
        response.put("status", "INSERTED");
        return response;
    }

    @DeleteMapping("/delete/{id}")
    public Map<String, String> deleteItem(@PathVariable Long id) {
        Map<String, String> response = new HashMap<>();
        if (rss25Service.deleteItem(id)) {
            response.put("id", id.toString());
            response.put("status", "DELETED");
        } else {
            response.put("status", "ERROR");
        }
        return response;
    }
}