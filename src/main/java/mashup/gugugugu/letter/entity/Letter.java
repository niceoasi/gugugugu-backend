package mashup.gugugugu.letter.entity;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class Letter {
    private Long letterId;
    private Long senderId;
    private Long reciverId;
    private String senderName;
    private String reciverName;
    private String title;
    private String content;
    private String imageUrl;
    private Long preLetterId;
    private Boolean senderDelete;
    private Boolean receiverDelete;
    private LocalDateTime createDate;
}

/*
Letter

letterId: Long
senderId: Long
reciverId: Long
senderName: String
reciverName: String
title: String
content: String
imageUrl: String
preLetterId: Long
senderDelete: Bool
receiverDelete: Bool
createDate: Date


createDate: String
{
  "letters": [
    {
      "sendingLetter":
      {
        "letterId"
        "reciverId":"",
        "senderId":"",
        "senderName":"",
        "reciverName":"",
        "title":"",
        "content":"",
        "createDate":""
      },
      "receivingLetter":
      {
        "letterId"
        "reciverId":"",
        "senderId":"",
        "senderName":"",
        "reciverName":"",
        "title":"",
        "content":"",
        "createDate":""
      }
    }
  ]
}
 */
