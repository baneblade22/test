/**
 * Информация о способе и месте хранения образца
 */
package com.db.Tables;

import com.db.Tables.Dictionary.DicStoragePlace;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
public class SampleStorage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Sample sampleId; // ID образца

    private Date dateOfSample; // Дата взятия образца

    @ManyToOne
    private DicStoragePlace localStorage; // ID места хранения образца

    private String name; // Название контейнера с образцом
}
