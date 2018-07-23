/**
 * Информация о направлении на генетический анализ
 */
package com.db.Tables;

import com.db.Tables.Dictionary.DicTraitName;
import com.db.Tables.UserTables.Account;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
public class Request {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private Date dateOfAcquiring; // Дата получения/генерации сорта

    @ManyToOne
    private DicTraitName phenotype; // Характеристика

    @ManyToOne
    private CultivarCard cultivar; // Id сорта

    @ManyToOne
    private Account curator; // Id куратора

    private String genotype; //Направление на секвенирование
}
