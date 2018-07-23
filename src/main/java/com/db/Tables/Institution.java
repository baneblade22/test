/**
 * Информация о селекционном учреждении, адрес, название
 */
package com.db.Tables;

import com.db.Tables.Dictionary.DicRegions;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Institution {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String name; // Название учреждения
    private String shortName;
    private String zipCode; // Почтовый индекс

    @ManyToOne
    private DicRegions region;

    private String city; //
    private String houseNum;
    private String bldgNum; // Номер корпуса или строения
    private String other; // Другие данные

}
