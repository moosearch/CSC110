/* Directives */

#include <stdio.h>

int main(void)
{

double heading; /*compass heading in degrees*/

/* Get compass heading */

do
{
printf("Enter a Compass Heading: ");
scanf("%lf", &heading);

/* Display equivalent compass bearing */

if (heading < 0.0 || heading > 360.0)
printf("Please Input a Compass Heading between 0 and 360 Degrees.\n", heading);
} while (heading < 0.0 || heading > 360.0);

if(heading <= 90.0)
    printf("Compass Bearing: North %.1f Deg East\n", heading);

else if(heading < 180.0)
    printf("Compass Bearing: South %.1f Deg East\n", 180 - heading);

else if(heading <= 270.0)
    printf("Compass Bearing: South %.1f Deg West\n", heading - 180.0);

else if(heading <360.0)
    printf("Compass Bearing: North %.1f Deg West\n", 360.0 - heading);

else if(heading == 360.0)
    printf("Compass Bearing: North %.1f Deg East\n", 360.0 - heading);
else
    printf("Please Input a Compass Heading between 0 and 360 Degrees.\n", heading);



/* End Program */
return(0);
}