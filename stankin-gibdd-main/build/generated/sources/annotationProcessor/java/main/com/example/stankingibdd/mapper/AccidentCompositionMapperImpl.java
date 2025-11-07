package com.example.stankingibdd.mapper;

import com.example.stankingibdd.entity.AccidentComposition;
import com.example.stankingibdd.entity.Vehicle;
import com.example.stankingibdd.model.AccidentCompositionDto;
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
public class AccidentCompositionMapperImpl extends AccidentCompositionMapper {

    @Override
    public AccidentCompositionDto map(AccidentComposition source) {
        if ( source == null ) {
            return null;
        }

        AccidentCompositionDto.AccidentCompositionDtoBuilder accidentCompositionDto = AccidentCompositionDto.builder();

        accidentCompositionDto.registrationNumber( sourceVehicleRegistrationNumber( source ) );
        if ( source.getAccidentId() != null ) {
            accidentCompositionDto.accidentId( source.getAccidentId().toString() );
        }

        return accidentCompositionDto.build();
    }

    @Override
    public List<AccidentCompositionDto> map(List<AccidentComposition> source) {
        if ( source == null ) {
            return null;
        }

        List<AccidentCompositionDto> list = new ArrayList<AccidentCompositionDto>( source.size() );
        for ( AccidentComposition accidentComposition : source ) {
            list.add( map( accidentComposition ) );
        }

        return list;
    }

    private String sourceVehicleRegistrationNumber(AccidentComposition accidentComposition) {
        if ( accidentComposition == null ) {
            return null;
        }
        Vehicle vehicle = accidentComposition.getVehicle();
        if ( vehicle == null ) {
            return null;
        }
        String registrationNumber = vehicle.getRegistrationNumber();
        if ( registrationNumber == null ) {
            return null;
        }
        return registrationNumber;
    }
}
