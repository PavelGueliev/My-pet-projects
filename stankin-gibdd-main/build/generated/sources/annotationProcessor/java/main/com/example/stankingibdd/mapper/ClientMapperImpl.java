package com.example.stankingibdd.mapper;

import com.example.stankingibdd.entity.Client;
import com.example.stankingibdd.model.ClientDto;
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
public class ClientMapperImpl extends ClientMapper {

    @Override
    public Client map(ClientDto source) {
        if ( source == null ) {
            return null;
        }

        Client.ClientBuilder client = Client.builder();

        client.fullName( source.getFullName() );
        client.dateOfBirth( source.getDateOfBirth() );
        client.phone( source.getPhone() );
        client.address( source.getAddress() );
        client.passportNumber( source.getPassportNumber() );
        client.passportIssueDate( source.getPassportIssueDate() );
        client.passportDepartmentCode( source.getPassportDepartmentCode() );
        client.role( source.getRole() );

        return client.build();
    }

    @Override
    public ClientDto map(Client source) {
        if ( source == null ) {
            return null;
        }

        ClientDto clientDto = new ClientDto();

        clientDto.setPhone( source.getPhone() );
        clientDto.setClientPassword( source.getClientPassword() );
        clientDto.setFullName( source.getFullName() );
        clientDto.setDateOfBirth( source.getDateOfBirth() );
        clientDto.setAddress( source.getAddress() );
        clientDto.setPassportNumber( source.getPassportNumber() );
        clientDto.setPassportIssueDate( source.getPassportIssueDate() );
        clientDto.setPassportDepartmentCode( source.getPassportDepartmentCode() );
        clientDto.setRole( source.getRole() );

        return clientDto;
    }

    @Override
    public List<ClientDto> map(List<Client> source) {
        if ( source == null ) {
            return null;
        }

        List<ClientDto> list = new ArrayList<ClientDto>( source.size() );
        for ( Client client : source ) {
            list.add( map( client ) );
        }

        return list;
    }
}
