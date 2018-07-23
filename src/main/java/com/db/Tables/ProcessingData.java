/**
 * Информация о результатах обработки анализа
 */
package com.db.Tables;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
public class ProcessingData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private FileRepository sampleId; // ID образца

    private Date dateProcess; // Дата обработки образца

    @ManyToOne
    private ProcessingStage stageId; // Этап обработки

    @ManyToOne
    private Processing processingId; // ID обработки данных

    private String data; // Данные, которые получаются при завершении этапа обработки
}
