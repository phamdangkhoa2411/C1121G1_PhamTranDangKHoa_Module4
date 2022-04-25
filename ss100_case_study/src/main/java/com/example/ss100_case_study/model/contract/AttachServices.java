package com.example.ss100_case_study.model.contract;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "attach_services")
public class AttachServices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAttachServices;
    private String nameAttachServices ;
    @Column(columnDefinition = "double")
    private String costAttachServices ;
    private Integer unitAttachServices ;
    private String statusAttachServices ;

}
