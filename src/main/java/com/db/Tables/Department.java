/**
 * Информация о кафедре/отделении селекционного учреждения
 */
package com.db.Tables;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private int deptNum; // Номер отделения
    private String deptName; // Название отделения
    private String telNumber; // Номер телефона

    @ManyToOne
    private Institution institution; // Id учреждения
}
