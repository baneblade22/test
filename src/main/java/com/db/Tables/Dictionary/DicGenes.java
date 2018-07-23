/**
Информация о генах сои (подобъект "Генотип")
 */

package com.db.Tables.Dictionary;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
public class DicGenes {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true)
    private long filledId; // Внутренний уникальный ID соответствует ID гена из базы SoyBase
    private String symbol; // Символ/значок гена
    private String locustag; // Позиция гена в геноме (индивидуальный локус на хромосоме)
    private String chromosome; // Хромосома на которой находится локус
    private String typeOfGene; // Тип гена (кодирующий, не кодирующий, псевдоген и т.д)
    private String description; // Описание гена
    private Date modificationDate; // Дата внесения информации о гене

}
