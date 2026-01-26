Amazon S3 diff checker
The AWS SAM template deploys an AWS Lambda function and an Amazon S3 bucket with versioning enabled. The Lambda function is invoked when new objects are put into the bucket.

When versions of an object are uploaded, it logs out the difference between the latest version and the previous version. Using a configurable setting in template.yaml, it also deletes earlier versions of the object, retaining the most recent versions.

Important: this application uses various AWS services and there are costs associated with these services after the Free Tier usage - please see the AWS Pricing page for details. You are responsible for any AWS costs incurred. No warranty is implied in this example.

To learn more about how this application works, see the article on the AWS Compute Blog: https://aws.amazon.com/blogs/compute/building-a-difference-checker-with-amazon-s3-and-aws-lambda/.

.
├── README.MD                   <-- This instructions file
├── src                         <-- Source code for a lambda function
│   └── app.js                  <-- Main Lambda handler
│   └── processS3.js            <-- Processes each S3 object
│   └── deleteS3.js             <-- Removes earlier versions of an object
│   └── compareS3.js            <-- Compares most recent two versions
├── template.yaml               <-- SAM template
