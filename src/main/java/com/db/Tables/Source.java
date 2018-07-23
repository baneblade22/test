/**
Информация об источнике данных, статье, патенте и т.п.
 */
package com.db.Tables;

import com.db.Tables.Dictionary.DicExperimentType;
import com.db.Tables.Dictionary.DicMutType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Source {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private long extId; // Id источника данных из внешней базы данных
    private String link; // Ссылка на источник данных
    @ManyToOne
    private DicMutType dataType;
    @ManyToOne
    private DicExperimentType experimentType;
    private String fullName; // Полное название источника данных, список авторов
    private String journal; // Название журнала, в котором опубликована статья
    @Column(length = 4)
    private int pubYear; // Год публикации
}
