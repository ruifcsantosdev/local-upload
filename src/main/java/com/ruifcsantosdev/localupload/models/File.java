package com.ruifcsantosdev.localupload.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class File {
    private String name;
    private String url;
}
