package com.example.stankingibdd.mapper;

import com.example.stankingibdd.entity.DrivingLicense;
import com.example.stankingibdd.model.DrivingLicenseDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-07T00:26:12+0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.10.2.jar, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class DrivingLicenseMapperImpl extends DrivingLicenseMapper {

    @Override
    public DrivingLicense map(DrivingLicenseDto source) {
        if ( source == null ) {
            return null;
        }

        DrivingLicense.DrivingLicenseBuilder drivingLicense = DrivingLicense.builder();

        drivingLicense.licenseNumber( source.getLicenseNumber() );
        drivingLicense.issueDate( source.getIssueDate() );
        drivingLicense.expirationDate( source.getExpirationDate() );
        drivingLicense.departmentCode( source.getDepartmentCode() );

        return drivingLicense.build();
    }

    @Override
    public DrivingLicenseDto map(DrivingLicense source) {
        if ( source == null ) {
            return null;
        }

        DrivingLicenseDto drivingLicenseDto = new DrivingLicenseDto();

        drivingLicenseDto.setLicenseNumber( source.getLicenseNumber() );
        drivingLicenseDto.setIssueDate( source.getIssueDate() );
        drivingLicenseDto.setExpirationDate( source.getExpirationDate() );
        drivingLicenseDto.setDepartmentCode( source.getDepartmentCode() );

        return drivingLicenseDto;
    }

    @Override
    public List<DrivingLicenseDto> map(List<DrivingLicense> source) {
        if ( source == null ) {
            return null;
        }

        List<DrivingLicenseDto> list = new ArrayList<DrivingLicenseDto>( source.size() );
        for ( DrivingLicense drivingLicense : source ) {
            list.add( map( drivingLicense ) );
        }

        return list;
    }
}
