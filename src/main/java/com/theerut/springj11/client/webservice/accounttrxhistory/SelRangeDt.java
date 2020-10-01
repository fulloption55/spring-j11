package com.theerut.springj11.client.webservice.accounttrxhistory;

import com.theerut.springj11.utils.LocalDateTimeAdapter;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;


@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelRangeDt", propOrder = {
        "startDt",
        "endDt"
})
public class SelRangeDt {
    @XmlElement(name = "StartDt")
    @XmlSchemaType(name = "dateTime")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    protected LocalDateTime startDt;
    @XmlElement(name = "EndDt")
    @XmlSchemaType(name = "dateTime")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    protected LocalDateTime endDt;

}
