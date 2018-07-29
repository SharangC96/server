package com.expedia.server.repo;

import com.expedia.server.models.student;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.repository.CrudRepository;

public interface studentRepo extends CrudRepository<student,ID> {
}
