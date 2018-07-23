/**
 * Список этапов роста сои (от семени до полного созревания)
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
public class DicStage {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private  String term; // Название степени растительного развития сои
}
