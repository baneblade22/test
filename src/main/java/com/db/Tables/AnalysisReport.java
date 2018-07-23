/**
 * Информация об отчете о результатах анализа
 */
package com.db.Tables;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
public class AnalysisReport {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Request analysisId;

    @Column(unique = true)
    private long sampleFastqId; // Внутренний уникальный ID, соответствуюший ID fastq файла

    private String reportData; // Данные отчета

    private Date dateCreate;

    private String hasError; // Отметка о налиции ошибки формирования/создания отчета

}
