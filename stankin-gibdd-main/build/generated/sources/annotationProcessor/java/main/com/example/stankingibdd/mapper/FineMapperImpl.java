package com.example.stankingibdd.mapper;

import com.example.stankingibdd.entity.Fine;
import com.example.stankingibdd.model.FineDto;
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
public class FineMapperImpl extends FineMapper {

    @Override
    public Fine map(FineDto source) {
        if ( source == null ) {
            return null;
        }

        Fine.FineBuilder fine = Fine.builder();

        if ( source.getFineId() != null ) {
            fine.fineId( UUID.fromString( source.getFineId() ) );
        }
        fine.date( source.getDate() );
        fine.time( source.getTime() );
        fine.location( source.getLocation() );
        fine.amount( source.getAmount() );
        fine.type( source.getType() );
        fine.description( source.getDescription() );
        fine.article( source.getArticle() );

        return fine.build();
    }

    @Override
    public Fine mapWithoutId(FineDto source) {
        if ( source == null ) {
            return null;
        }

        Fine.FineBuilder fine = Fine.builder();

        fine.date( source.getDate() );
        fine.time( source.getTime() );
        fine.location( source.getLocation() );
        fine.amount( source.getAmount() );
        fine.type( source.getType() );
        fine.description( source.getDescription() );
        fine.article( source.getArticle() );

        return fine.build();
    }

    @Override
    public FineDto map(Fine source) {
        if ( source == null ) {
            return null;
        }

        FineDto.FineDtoBuilder fineDto = FineDto.builder();

        if ( source.getFineId() != null ) {
            fineDto.fineId( source.getFineId().toString() );
        }
        fineDto.date( source.getDate() );
        fineDto.time( source.getTime() );
        fineDto.location( source.getLocation() );
        fineDto.amount( source.getAmount() );
        fineDto.type( source.getType() );
        fineDto.description( source.getDescription() );
        fineDto.article( source.getArticle() );

        return fineDto.build();
    }

    @Override
    public List<FineDto> map(List<Fine> source) {
        if ( source == null ) {
            return null;
        }

        List<FineDto> list = new ArrayList<FineDto>( source.size() );
        for ( Fine fine : source ) {
            list.add( map( fine ) );
        }

        return list;
    }
}
