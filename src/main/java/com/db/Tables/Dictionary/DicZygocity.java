/**
Список эффектов зиготности мутации, влияющей на характеристику/признак сои (подобъект "Фенотип")
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
public class DicZygocity {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String term; // Название зиготности на английском
    private String fullName; // Полное название зиготности на английском языке
    private String shortName;
    private String nameRus; // Название зиготности на русском
    private String fullNameRus;
    private String shortNameRus;
    private String comment; // Внутренний  комментарий
    private String description; // Описание

}
