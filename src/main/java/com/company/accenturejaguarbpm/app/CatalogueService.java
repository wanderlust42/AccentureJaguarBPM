package com.company.accenturejaguarbpm.app;

import com.company.accenturejaguarbpm.entity.CarExist;
import com.company.accenturejaguarbpm.entity.Catalogue;
import com.company.accenturejaguarbpm.entity.Customer;
import io.jmix.core.DataManager;
import org.flowable.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CatalogueService {

    @Autowired
    private DataManager dataManager;

    @Autowired
    private RuntimeService runtimeService;

    public void findCarInCatalogue(Customer customer, String executionId) {
        List<CarExist> existingCars = dataManager.load(CarExist.class)
                .query("select ce from CarExist ce where ce.carOwner = :customer")
                .parameter("customer", customer)
                .list();

        for (CarExist existingCar : existingCars) {
            List<Catalogue> catalogueList = dataManager.load(Catalogue.class)
                    .query("select c from Catalogue c where c.model = :model and c.year > :carYear")
                    .parameter("model", existingCar.getModel())
                    .parameter("carYear", existingCar.getYear_of_production())
                    .list();

            if (!catalogueList.isEmpty()) {
                Catalogue catalogue = catalogueList.get(0);
                runtimeService.setVariable(executionId, "carExist", existingCar);
                runtimeService.setVariable(executionId, "catalogue", catalogue);
                return;
            }
        }

        runtimeService.setVariable(executionId, "carExist", null);
        runtimeService.setVariable(executionId, "catalogue", null);

    }

}
