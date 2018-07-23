/**
Список единиц измерения (ридов) (подобъект "Генотип")
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
public class DicReadUnit {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String term; // Название единицы измерения на английском
    private String fullName; // Полное название единицы измерения на английском языке
    private String shortName;
    private String nameRus; // Название единицы измерения на русском
    private String fullNameRus;
    private String shortNameRus;
    private String comment; // Внутренний  комментарий
    private String description; // Описание

}
