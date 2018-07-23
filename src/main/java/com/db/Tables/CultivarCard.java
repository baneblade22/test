/**
 * Информация о сорте
 */
package com.db.Tables;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
public class CultivarCard {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String name; // Название сорта
    private String creatorName; // Имя производителя
    private Date dateOfCreation; // Дата получения

}
