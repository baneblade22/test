/**
 * Информация о совпадении фенотипа с фенотипом, прогназированны
 * на основе генотипического анализа пробы
 */
package com.db.Tables;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
public class Conclusion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Date conclusionDate; //Дата прогнозируемого фенотипа на основании секвенирования

    @ManyToOne
    private Request request;

    @Column(unique = true) // Внутренний уникальный id, соответствующий id фенотипа нового сорта сои
    private long newCultivar;

    private String comment; // Комментарий
}
