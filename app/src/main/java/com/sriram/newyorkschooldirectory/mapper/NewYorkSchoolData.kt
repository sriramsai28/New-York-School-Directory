package com.sriram.newyorkschooldirectory.mapper

import com.sriram.newyorkschooldirectory.data.database.model.NewYorkSchoolEntity
import com.sriram.newyorkschooldirectory.data.remote.model.NewYorkSchoolDto
import com.sriram.newyorkschooldirectory.domain.model.NewYorkSchool

fun NewYorkSchoolDto.toNewYorkEntity(): NewYorkSchoolEntity {
    return NewYorkSchoolEntity(
        addtl_info1,
        advancedplacement_courses,
        attendance_rate,
        bbl,
        bin,
        boro,
        borough,
        boys,
        building_code,
        bus,
        campus_name,
        census_tract,
        city,
        college_career_rate,
        community_board,
        council_district,
        dbn,
        diplomaendorsements,
        earlycollege,
        ell_programs,
        end_time,
        extracurricular_activities,
        fax_number,
        finalgrades,
        geoeligibility,
        girls,
        grades2018,
        graduation_rate,
        international,
        language_classes,
        latitude,
        location,
        longitude,
        neighborhood,
        nta,
        overview_paragraph,
        pbat,
        pct_stu_enough_variety,
        pct_stu_safe,
        phone_number,
        primary_address_line_1,
        psal_sports_boys,
        psal_sports_coed,
        psal_sports_girls,
        ptech,
        school_10th_seats,
        school_accessibility_description,
        school_email,
        school_name,
        school_sports,
        shared_space,
        specialized,
        start_time,
        state_code,
        subway,
        total_students,
        transfer,
        website,
        zip,
    )
}

fun NewYorkSchoolEntity.toNewYorkSchool(): NewYorkSchool {
    return NewYorkSchool(
        addtl_info1,
        advancedplacement_courses,
        attendance_rate,
        bbl,
        bin,
        boro,
        borough,
        boys,
        building_code,
        bus,
        campus_name,
        census_tract,
        city,
        college_career_rate,
        community_board,
        council_district,
        dbn,
        diplomaendorsements,
        earlycollege,
        ell_programs,
        end_time,
        extracurricular_activities,
        fax_number,
        finalgrades,
        geoeligibility,
        girls,
        grades2018,
        graduation_rate,
        international,
        language_classes,
        latitude,
        location,
        longitude,
        neighborhood,
        nta,
        overview_paragraph,
        pbat,
        pct_stu_enough_variety,
        pct_stu_safe,
        phone_number,
        primary_address_line_1,
        psal_sports_boys,
        psal_sports_coed,
        psal_sports_girls,
        ptech,
        school_10th_seats,
        school_accessibility_description,
        school_email,
        school_name,
        school_sports,
        shared_space,
        specialized,
        start_time,
        state_code,
        subway,
        total_students,
        transfer,
        website,
        zip,
        id
    )
}