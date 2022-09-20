package admin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Fiction {
    private String id;
    private String fictionname;
    private String authors;
    private String status;
    private String classify;
    private int word;
    private int Alrecommend;
    private int hits;
    private int Werecommend;
    private int support;


}
