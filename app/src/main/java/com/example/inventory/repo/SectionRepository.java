package com.example.inventory.repo;

import com.example.inventory.pojo.Section;

import java.util.ArrayList;

/**
 * @author Elena G (Beelzenef)
 */

public class SectionRepository {

    ArrayList<Section> sections;
    static SectionRepository sectionRepository;

    static {
        sectionRepository = new SectionRepository();
    }

    void inicializarSections()
    {
        addSection(new Section(1, "Sector 1", "S1", "Description 1", 1, true, true ));
        addSection(new Section(1, "Sector 2", "S2", "Description 2", 2, true, false ));
        addSection(new Section(1, "Sector 3", "S3", "Description 3", 3, true, false ));

    }

    private SectionRepository()
    {
        this.sections = new ArrayList<>();
        inicializarSections();
    }

    void addSection(Section s)
    {
        sections.add(s);
    }

    public static SectionRepository getInstance()
    {
        return sectionRepository;
    }

    public ArrayList<Section> getSections()
    {
        return sections;
    }
}
