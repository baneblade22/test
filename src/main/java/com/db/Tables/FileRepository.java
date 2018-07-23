/**
 * Информация о файле с данными результатов анализа,
 * его названии, типе и платформе
 */
package com.db.Tables;

import com.db.Tables.Dictionary.DicFileTypes;
import com.db.Tables.Dictionary.DicPlatform;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class FileRepository {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Sample sample;

    @ManyToOne
    private DicFileTypes fileType;

    @ManyToOne
    private DicPlatform seqType;

    private String fileLocation; // URL, где хранится файл
    private String fileName; // Название файла

}
