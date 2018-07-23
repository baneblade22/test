/**
 * Информация о сравнении результатов аналза пробы с базой данных
 */
package com.db.Tables;

import com.db.Tables.Dictionary.DicMutEffect;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class DbComparison {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private AnalysisResults result;

    @ManyToOne
    private DicMutEffect dbSnp;
}
