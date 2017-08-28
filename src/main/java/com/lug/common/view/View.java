package com.lug.common.view;

public class View {
   public interface Summary {}
   public interface SummaryWithDetail extends Summary{}

   public interface SummaryWithMoreDetail extends SummaryWithDetail{}
}