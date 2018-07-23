/**
 * Список статусов (Забор, выделение ДНК, SSR/секвенирование,
 * обсчет данных) анализируемых образцов
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
public class DicStatus {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private  String term; // Список статусов образов на анлийском языке
    private  String termRus; // Список статусов образов на русском языке
}
