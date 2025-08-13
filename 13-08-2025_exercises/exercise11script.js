const futureDate = new Date('2030-08-13');
const daysOfWeek = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
const dayIndex = futureDate.getDay();
const dayName = daysOfWeek[dayIndex];
console.log(`13th August 2030 will be a ${dayName}`);
