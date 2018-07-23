/**
 * Информация о результатах анализа пробы
 */
package com.db.Tables;

import com.db.Tables.Dictionary.DicReadUnit;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
public class AnalysisResults {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Sample sample;

    @ManyToOne
    private DicReadUnit readProfile;

    private Date resultDate;

}
