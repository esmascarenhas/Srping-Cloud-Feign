package br.com.tqi.provider.api.controller;

import br.com.tqi.provider.domain.entity.InfoProvider;
import br.com.tqi.provider.domain.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping("/{state}")
    public InfoProvider getInfoWithState(@PathVariable String state){
        return infoService.getInfoWithState(state);

    }
    @GetMapping
    public List<InfoProvider> listALL(){
        return infoService.listALL();
    }

/*    @GetMapping("/{id}")
    public InfoProvider getInfoWithID(@PathVariable Long id){
        return infoService.getInfoWithId(id);
    }*/

    @PostMapping
    public InfoProvider createInfo(@RequestBody InfoProvider infoProvider){
        return infoService.createInfo(infoProvider);
    }

    @DeleteMapping("/{id}")
    public void deleteByid(@PathVariable Long id){
        infoService.deleteById(id);
    }
}
