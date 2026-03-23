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
                    <title>Route A Sample</title>
                  </head>
                  <body>
                    <h1>Route A Sample</h1>
                    <p>導線Aのサンプル画面です。</p>
                  </body>
                </html>
                """;
    }
}
