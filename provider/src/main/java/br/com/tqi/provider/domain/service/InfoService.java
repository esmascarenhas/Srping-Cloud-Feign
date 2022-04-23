package br.com.tqi.provider.domain.service;

import br.com.tqi.provider.domain.entity.InfoProvider;
import br.com.tqi.provider.domain.exception.ProviderNotFoundException;
import br.com.tqi.provider.domain.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoService {

    @Autowired
    private InfoRepository repository;

    public InfoProvider getInfoWithState(String state) {
        return repository.findByState(state);

    }

    public InfoProvider getInfoWithId(Long id) {
        return repository.findById(id).
                orElseThrow(()-> new ProviderNotFoundException(id));
    }

    public InfoProvider createInfo(InfoProvider infoProvider) {
        return repository.save(infoProvider);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<InfoProvider> listALL() {
        return repository.findAll();
    }
}
