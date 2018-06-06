package com.easyfly.main.dao;

import com.easyfly.main.bean.ViewRecord2Word;
import com.easyfly.main.bean.ViewRecord2WordExample;
import com.easyfly.main.bean.ViewRecord2WordWithBLOBs;
import java.util.List;

public interface ViewRecord2WordMapper {
    ViewRecord2WordWithBLOBs selectByRecId(Integer recId);

}