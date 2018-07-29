package com.expedia.server.repo;

import com.expedia.server.models.student;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepo extends JpaRepository<student,ID> {
}
