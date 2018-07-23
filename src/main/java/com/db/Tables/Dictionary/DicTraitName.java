/**
Список названий всех известных характеристик\признаков сои (подобъект "Фенотип")
 */
package com.db.Tables.Dictionary;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class DicTraitName {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String term; // Общепринятое название хар-ки на англ
    private String fullName;
    private String shortName;
    private String nameRus; // Название хар-ки на русском языке
    private String fullNameRus;
    private String shortNameRus;
    private String comment; // Внутренний комментарий
    private String description; // Описание

}
