package mashup.gugugugu.letter.controller;

import mashup.gugugugu.letter.service.LetterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mashup.gugugugu.letter.dto.PostboxRequestDto;

@RestController
@RequestMapping("/letter")
public class LetterController {

    private LetterService letterService;

    public LetterController(LetterService letterService) {
        this.letterService = letterService;
    }

    @PostMapping("")
    public ResponseEntity register(@RequestBody PostboxRequestDto requestBody) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
