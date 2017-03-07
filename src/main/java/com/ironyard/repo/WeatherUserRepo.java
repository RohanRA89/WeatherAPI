package com.ironyard.repo;

import com.ironyard.data.WeatherUser;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rohanayub on 3/1/17.
 */

public interface WeatherUserRepo extends CrudRepository<WeatherUser, Long> {
}
