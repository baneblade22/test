/**
 * Список мест хранения образца в лаборатории
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
public class DicStoragePlace {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String locker; // Шкаф хранения образца
    private String shelf; // Полка
    private String cell; // Ячейка хранения образца
}
