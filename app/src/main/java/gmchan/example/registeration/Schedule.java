package gmchan.example.registeration;

import android.content.Context;

class Schedule {

    private String monday[]=new String[14];
    private String tuesday[]=new String[14];
    private String wednesday[]=new String[14];
    private String thursday[]=new String[14];
    private String friday[]=new String[14];

    public Schedule(){
        for(int i=0; i<14; i++){
            monday[i]="";
            tuesday[i]="";
            wednesday[i]="";
            thursday[i]="";
            friday[i]="";

        }
    }

    public void addSchedule(String scheduleText)
    {
        int temp;
        //월:[3][4][5] 화:[4][5]
        if((temp=scheduleText.indexOf("월"))>-1){
            temp+=2;
            int startPoint=temp;
            int endPoint=temp;
            for(int i=temp; i<scheduleText.length() && scheduleText.charAt(i)!=':'; i++){
                if(scheduleText.charAt(i)=='[')
                {
                    startPoint=i;
                }

                if(scheduleText.charAt(i)==']')
                {
                    endPoint=i;
                    monday[Integer.parseInt(scheduleText.substring(startPoint+1,endPoint))]="수업";
                }
            }
        }

        if((temp=scheduleText.indexOf("화"))>-1){
            temp+=2;
            int startPoint=temp;
            int endPoint=temp;
            for(int i=temp; i<scheduleText.length() && scheduleText.charAt(i)!=':'; i++){
                if(scheduleText.charAt(i)=='[')
                {
                    startPoint=i;
                }

                if(scheduleText.charAt(i)==']')
                {
                    endPoint=i;
                    tuesday[Integer.parseInt(scheduleText.substring(startPoint+1,endPoint))]="수업";
                }
            }
        }

        if((temp=scheduleText.indexOf("수"))>-1){
            temp+=2;
            int startPoint=temp;
            int endPoint=temp;
            for(int i=temp; i<scheduleText.length() && scheduleText.charAt(i)!=':'; i++){
                if(scheduleText.charAt(i)=='[')
                {
                    startPoint=i;
                }

                if(scheduleText.charAt(i)==']')
                {
                    endPoint=i;
                    wednesday[Integer.parseInt(scheduleText.substring(startPoint+1,endPoint))]="수업";
                }
            }
        }

        if((temp=scheduleText.indexOf("목"))>-1){
            temp+=2;
            int startPoint=temp;
            int endPoint=temp;
            for(int i=temp; i<scheduleText.length() && scheduleText.charAt(i)!=':'; i++){
                if(scheduleText.charAt(i)=='[')
                {
                    startPoint=i;
                }

                if(scheduleText.charAt(i)==']')
                {
                    endPoint=i;
                    thursday[Integer.parseInt(scheduleText.substring(startPoint+1,endPoint))]="수업";
                }
            }
        }

        if((temp=scheduleText.indexOf("금"))>-1){
            temp+=2;
            int startPoint=temp;
            int endPoint=temp;
            for(int i=temp; i<scheduleText.length() && scheduleText.charAt(i)!=':'; i++){
                if(scheduleText.charAt(i)=='[')
                {
                    startPoint=i;
                }

                if(scheduleText.charAt(i)==']')
                {
                    endPoint=i;
                    friday[Integer.parseInt(scheduleText.substring(startPoint+1,endPoint))]="수업";
                }
            }
        }
    }

    public boolean validate(String scheduleText){
        if(scheduleText.equals("")) {
            return true;
        }

        int temp;
        if((temp=scheduleText.indexOf("월"))>-1){
            temp+=2;
            int startPoint=temp;
            int endPoint=temp;
            for(int i=temp; i<scheduleText.length() && scheduleText.charAt(i)!=':'; i++){
                if(scheduleText.charAt(i)=='[')
                {
                    startPoint=i;
                }

                if(scheduleText.charAt(i)==']')
                {
                    endPoint=i;
                    if(!monday[Integer.parseInt(scheduleText.substring(startPoint+1,endPoint))].equals(""))
                    {
                        return false;
                    }
                }
            }
        }

        if((temp=scheduleText.indexOf("화"))>-1){
            temp+=2;
            int startPoint=temp;
            int endPoint=temp;
            for(int i=temp; i<scheduleText.length() && scheduleText.charAt(i)!=':'; i++){
                if(scheduleText.charAt(i)=='[')
                {
                    startPoint=i;
                }

                if(scheduleText.charAt(i)==']')
                {
                    endPoint=i;
                    if(!tuesday[Integer.parseInt(scheduleText.substring(startPoint+1,endPoint))].equals(""))
                    {
                        return false;
                    }
                }
            }
        }

        if((temp=scheduleText.indexOf("수"))>-1){
            temp+=2;
            int startPoint=temp;
            int endPoint=temp;
            for(int i=temp; i<scheduleText.length() && scheduleText.charAt(i)!=':'; i++){
                if(scheduleText.charAt(i)=='[')
                {
                    startPoint=i;
                }

                if(scheduleText.charAt(i)==']')
                {
                    endPoint=i;
                    if(!wednesday[Integer.parseInt(scheduleText.substring(startPoint+1,endPoint))].equals(""))
                    {
                        return false;
                    }
                }
            }
        }

        if((temp=scheduleText.indexOf("목"))>-1){
            temp+=2;
            int startPoint=temp;
            int endPoint=temp;
            for(int i=temp; i<scheduleText.length() && scheduleText.charAt(i)!=':'; i++){
                if(scheduleText.charAt(i)=='[')
                {
                    startPoint=i;
                }

                if(scheduleText.charAt(i)==']')
                {
                    endPoint=i;
                    if(!thursday[Integer.parseInt(scheduleText.substring(startPoint+1,endPoint))].equals(""))
                    {
                        return false;
                    }
                }
            }
        }
        if((temp=scheduleText.indexOf("금"))>-1){
            temp+=2;
            int startPoint=temp;
            int endPoint=temp;
            for(int i=temp; i<scheduleText.length() && scheduleText.charAt(i)!=':'; i++){
                if(scheduleText.charAt(i)=='[')
                {
                    startPoint=i;
                }

                if(scheduleText.charAt(i)==']')
                {
                    endPoint=i;
                    if(!friday[Integer.parseInt(scheduleText.substring(startPoint+1,endPoint))].equals(""))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }



    // addSchedule 추가

    public void addSchedule(String scheduleText, String courseTitle, String courserProfessor)
    {
        String professor;
        if(courserProfessor.equals("")){
            professor="";
        }
        else{
            professor= "";
        }
        int temp;
        //월:[3][4][5] 화:[4][5]
        if((temp=scheduleText.indexOf("월"))>-1){
            temp+=2;
            int startPoint=temp;
            int endPoint=temp;
            for(int i=temp; i<scheduleText.length() && scheduleText.charAt(i)!=':'; i++){
                if(scheduleText.charAt(i)=='[')
                {
                    startPoint=i;
                }

                if(scheduleText.charAt(i)==']')
                {
                    endPoint=i;
                    monday[Integer.parseInt(scheduleText.substring(startPoint+1,endPoint))]= courseTitle + professor;
                }
            }
        }

        if((temp=scheduleText.indexOf("화"))>-1){
            temp+=2;
            int startPoint=temp;
            int endPoint=temp;
            for(int i=temp; i<scheduleText.length() && scheduleText.charAt(i)!=':'; i++){
                if(scheduleText.charAt(i)=='[')
                {
                    startPoint=i;
                }

                if(scheduleText.charAt(i)==']')
                {
                    endPoint=i;
                    tuesday[Integer.parseInt(scheduleText.substring(startPoint+1,endPoint))]=courseTitle+professor;
                }
            }
        }

        if((temp=scheduleText.indexOf("수"))>-1){
            temp+=2;
            int startPoint=temp;
            int endPoint=temp;
            for(int i=temp; i<scheduleText.length() && scheduleText.charAt(i)!=':'; i++){
                if(scheduleText.charAt(i)=='[')
                {
                    startPoint=i;
                }

                if(scheduleText.charAt(i)==']')
                {
                    endPoint=i;
                    wednesday[Integer.parseInt(scheduleText.substring(startPoint+1,endPoint))]=courseTitle+professor;
                }
            }
        }

        if((temp=scheduleText.indexOf("목"))>-1){
            temp+=2;
            int startPoint=temp;
            int endPoint=temp;
            for(int i=temp; i<scheduleText.length() && scheduleText.charAt(i)!=':'; i++){
                if(scheduleText.charAt(i)=='[')
                {
                    startPoint=i;
                }

                if(scheduleText.charAt(i)==']')
                {
                    endPoint=i;
                    thursday[Integer.parseInt(scheduleText.substring(startPoint+1,endPoint))]=courseTitle+professor;
                }
            }
        }

        if((temp=scheduleText.indexOf("금"))>-1){
            temp+=2;
            int startPoint=temp;
            int endPoint=temp;
            for(int i=temp; i<scheduleText.length() && scheduleText.charAt(i)!=':'; i++){
                if(scheduleText.charAt(i)=='[')
                {
                    startPoint=i;
                }

                if(scheduleText.charAt(i)==']')
                {
                    endPoint=i;
                    friday[Integer.parseInt(scheduleText.substring(startPoint+1,endPoint))]=courseTitle+professor;;
                }
            }
        }
    }



    //강의 목록을 보여주도록 세팅하는것.
    public void setting(AutoResizeTextView[] monday ,AutoResizeTextView[] tuesday, AutoResizeTextView[] wednesday, AutoResizeTextView[] thursday, AutoResizeTextView[] friday, Context context)
    {

        int maxLength=0;
        String maxString="";
        for(int i=0; i<14; i++)
        {
            if(this.monday[i].length()>maxLength){
                maxLength=this.monday[i].length();
                maxString=this.monday[i];
            }
            if(this.tuesday[i].length()>maxLength){
                maxLength=this.tuesday[i].length();
                maxString=this.tuesday[i];
            }
            if(this.wednesday[i].length()>maxLength){
                maxLength=this.wednesday[i].length();
                maxString=this.wednesday[i];
            }
            if(this.thursday[i].length()>maxLength){
                maxLength=this.thursday[i].length();
                maxString=this.thursday[i];
            }
            if(this.friday[i].length()>maxLength){
                maxLength=this.friday[i].length();
                maxString=this.friday[i];
            }
        }

        //처음작성
        for(int i=0; i<14; i++){

            if(!this.monday[i].equals(""))
            {
                monday[i].setText(this.monday[i]);
                monday[i].setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
            }
            else
            {
                monday[i].setText(maxString);
            }

            if(!this.tuesday[i].equals(""))
            {
                tuesday[i].setText(this.tuesday[i]);
                tuesday[i].setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
            }
            else
            {
                tuesday[i].setText(maxString);
            }
            if(!this.wednesday[i].equals(""))
            {
                wednesday[i].setText(this.wednesday[i]);
                wednesday[i].setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
            }
            else
            {
                wednesday[i].setText(maxString);
            }
            if(!this.thursday[i].equals(""))
            {
                thursday[i].setText(this.thursday[i]);
                thursday[i].setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
            }
            else
            {
                thursday[i].setText(maxString);
            }
            if(!this.friday[i].equals(""))
            {
                friday[i].setText(this.friday[i]);
                friday[i].setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
            }
            else
            {
                friday[i].setText(maxString);
            }

            monday[i].setSingleLine();
            tuesday[i].setSingleLine();
            wednesday[i].setSingleLine();
            thursday[i].setSingleLine();
            friday[i].setSingleLine();
        }
    }

}
