/**
Информация об описаниях этапов обработки данных
 */
package com.db.Tables;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class ProcessingStage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name; // Название этапа обработки


}
