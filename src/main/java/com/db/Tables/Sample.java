/**
 * Данные о пробе, взятой для анализа
 */
package com.db.Tables;

import com.db.Tables.Dictionary.DicReadUnit;
import com.db.Tables.Dictionary.DicSamplingMethod;
import com.db.Tables.Dictionary.DicStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
public class Sample {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    private Date dateOfSample; // Дата взятия образца

    @ManyToOne
    private Request analysis; //Направление на анализ

    @ManyToOne
    private DicSamplingMethod samplingMethod; // Метод взятия пробы

    private String storageTemp; // Температура хранения

//    private String storagePlace; // Место хранения образца

    private String localStorage; // Комната, в которой храится образец

    private String barcode; // Штрих-код пробы

    @ManyToOne
    private DicStatus status; //Статус пробы

    private String name; // Уникальное имя образца из даты и номера/наименования сорта

    private String part; //Отметка о части растения из которой получен образец

    @ManyToOne
    private DicReadUnit genotype; //Количество ридов

}
