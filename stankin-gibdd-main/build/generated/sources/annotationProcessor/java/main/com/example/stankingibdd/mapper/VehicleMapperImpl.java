package com.example.stankingibdd.mapper;

import com.example.stankingibdd.entity.Vehicle;
import com.example.stankingibdd.model.VehicleDto;
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
public class VehicleMapperImpl extends VehicleMapper {

    @Override
    public Vehicle map(VehicleDto source) {
        if ( source == null ) {
            return null;
        }

        Vehicle.VehicleBuilder vehicle = Vehicle.builder();

        vehicle.model( source.getModel() );
        vehicle.manufacturer( source.getManufacturer() );
        vehicle.yearOfManufacture( source.getYearOfManufacture() );
        vehicle.color( source.getColor() );
        vehicle.mileage( source.getMileage() );
        vehicle.engineVolume( source.getEngineVolume() );
        vehicle.horsepower( source.getHorsepower() );
        vehicle.registrationNumber( source.getRegistrationNumber() );
        vehicle.registrationDate( source.getRegistrationDate() );
        vehicle.registrationLocation( source.getRegistrationLocation() );

        return vehicle.build();
    }

    @Override
    public VehicleDto map(Vehicle source) {
        if ( source == null ) {
            return null;
        }

        VehicleDto.VehicleDtoBuilder vehicleDto = VehicleDto.builder();

        vehicleDto.registrationNumber( source.getRegistrationNumber() );
        vehicleDto.model( source.getModel() );
        vehicleDto.manufacturer( source.getManufacturer() );
        vehicleDto.yearOfManufacture( source.getYearOfManufacture() );
        vehicleDto.color( source.getColor() );
        vehicleDto.mileage( source.getMileage() );
        vehicleDto.engineVolume( source.getEngineVolume() );
        vehicleDto.horsepower( source.getHorsepower() );
        vehicleDto.registrationDate( source.getRegistrationDate() );
        vehicleDto.registrationLocation( source.getRegistrationLocation() );

        return vehicleDto.build();
    }

    @Override
    public List<VehicleDto> map(List<Vehicle> source) {
        if ( source == null ) {
            return null;
        }

        List<VehicleDto> list = new ArrayList<VehicleDto>( source.size() );
        for ( Vehicle vehicle : source ) {
            list.add( map( vehicle ) );
        }

        return list;
    }
}
