package com.example.a;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {

    @GetMapping(value = {"/a", "/a/"}, produces = MediaType.TEXT_HTML_VALUE)
    public String a() {
        return """
                <!doctype html>
                <html lang=\"ja\">
                  <head>
                    <meta charset=\"utf-8\" />
                    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />
                    <title>導線A</title>
                  </head>
                  <body>
                    <h1>こんにちわ</h1>
                  </body>
                </html>
                """;
    }
}
