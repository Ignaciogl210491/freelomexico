package com.mx.acquisitions.ms.ax.acquisitions.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.acquisitions.ms.ax.acquisitions.api.entity.ServiceTblActApiamexProp;

@Repository
public interface OrderNotificationRepository extends JpaRepository<ServiceTblActApiamexProp, UUID> {

}
