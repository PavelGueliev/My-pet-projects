package com.example.stankingibdd.mapper;

import com.example.stankingibdd.entity.Accident;
import com.example.stankingibdd.model.AccidentDto;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-07T00:26:12+0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.10.2.jar, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class AccidentMapperImpl extends AccidentMapper {

    @Override
    public Accident map(AccidentDto source) {
        if ( source == null ) {
            return null;
        }

        Accident.AccidentBuilder accident = Accident.builder();

        if ( source.getAccidentId() != null ) {
            accident.accidentId( UUID.fromString( source.getAccidentId() ) );
        }
        accident.time( source.getTime() );
        accident.location( source.getLocation() );
        accident.description( source.getDescription() );
        accident.date( source.getDate() );

        return accident.build();
    }

    @Override
    public Accident mapWithoutId(AccidentDto source) {
        if ( source == null ) {
            return null;
        }

        Accident.AccidentBuilder accident = Accident.builder();

        accident.time( source.getTime() );
        accident.location( source.getLocation() );
        accident.description( source.getDescription() );
        accident.date( source.getDate() );

        return accident.build();
    }

    @Override
    public AccidentDto map(Accident source) {
        if ( source == null ) {
            return null;
        }

        AccidentDto.AccidentDtoBuilder accidentDto = AccidentDto.builder();

        if ( source.getAccidentId() != null ) {
            accidentDto.accidentId( source.getAccidentId().toString() );
        }
        accidentDto.date( source.getDate() );
        accidentDto.time( source.getTime() );
        accidentDto.location( source.getLocation() );
        accidentDto.description( source.getDescription() );

        return accidentDto.build();
    }

    @Override
    public List<AccidentDto> map(List<Accident> source) {
        if ( source == null ) {
            return null;
        }

        List<AccidentDto> list = new ArrayList<AccidentDto>( source.size() );
        for ( Accident accident : source ) {
            list.add( map( accident ) );
        }

        return list;
    }
}
