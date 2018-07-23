/**
* Информация об изменениях в покрытии хромосом, которые были найдены
* у исследууемых сортов соии, по которым делаются выводы
* о характеристике/признаке данного сорта
 */
package com.db.Tables;

import com.db.Tables.Dictionary.DicChromosome;
import com.db.Tables.Dictionary.DicMutEffect;
import com.db.Tables.Dictionary.DicMutType;
import com.db.Tables.Dictionary.DicZygocity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Mutation {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private DicMutEffect mutEffect;

    @ManyToOne
    private DicMutType mutType;

    @ManyToOne
    private DicZygocity zygocity;

    @ManyToOne
    private DicChromosome chrom;

    private String sbSyntax; // Кодировка мутации в соответствии с номенклатурой ресурса SoyBase
    private int alleleNumber; // Колличество аллелей
    private long sbCount; // Id мутации из базы SoyBase
    private String comment; // Внутренний комментарий
}
