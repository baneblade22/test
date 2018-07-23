/**
Список хромосом генома сои (подобъект "Генотип")
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
public class DicChromosome {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String term; // Название хромосомы на английском
    private String fullName; // Полное название хромосомы на английском языке
    private String shortName;
    private String nameRus; // Название хромосомы на русском
    private String fullNameRus;
    private String shortNameRus;
    private String comment; // Внутренний  комментарий
    private String description; // Описание

}

