/**
 * Данные о характеристиках/признаках сорта сои
 */
package com.db.Tables;

import com.db.Tables.Dictionary.DicGrades;
import com.db.Tables.Dictionary.DicStage;
import com.db.Tables.Dictionary.DicTraitName;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
public class Characteristics {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private DicStage growthStage; // Стадия развития сои

    @ManyToOne
    private CultivarCard cultivarId; // Соответствующий Id сорта

    @ManyToOne
    private DicTraitName traitId; // Характеристика

    @ManyToOne
    private DicGrades gradeId; // Степень развития боба

    private Date date; // Дата внесения характеристик сорта
}
